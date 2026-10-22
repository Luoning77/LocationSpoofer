package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e03 extends ut2 {
    public final long c;
    public final float[] d;
    public final pf e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public e03(long j, float[] fArr) {
        fArr.getClass();
        this.c = j;
        this.d = fArr;
        this.e = q1.a("\nuniform shader cornerSdf;\nuniform float2 size;\nuniform float4 cornerSizes;\nuniform float4 halfRangesPx;\nuniform float4 blendWeights;\nuniform float bitmapSize;\nlayout(color) uniform half4 color;\n\nhalf4 main(float2 coord) {\n    float dxL = coord.x;\n    float dxR = size.x - coord.x;\n    float dyT = coord.y;\n    float dyB = size.y - coord.y;\n    bool left = dxL < dxR;\n    bool top = dyT < dyB;\n    float dx = left ? dxL : dxR;\n    float dy = top ? dyT : dyB;\n    // vec4 swizzle: AGSL forbids dynamic indexing. Channel order: x=topStart, y=topEnd, z=bottomEnd, w=bottomStart.\n    float cornerSize = top\n        ? (left ? cornerSizes.x : cornerSizes.y)\n        : (left ? cornerSizes.w : cornerSizes.z);\n    float halfRangePx = top\n        ? (left ? halfRangesPx.x : halfRangesPx.y)\n        : (left ? halfRangesPx.w : halfRangesPx.z);\n    float blendWeight = top\n        ? (left ? blendWeights.x : blendWeights.y)\n        : (left ? blendWeights.w : blendWeights.z);\n    if (dx >= cornerSize || dy >= cornerSize) {\n        return color;\n    }\n    float2 uv = float2(dx, dy) / cornerSize;\n    // LINEAR-sampled child: one tap == old 4-tap. Coord is uv*bitmapSize (NO -0.5; sampler adds half-texel).\n    half sdfSample = cornerSdf.eval(uv * bitmapSize).a;\n    float squircleSdf = (1.0 - 2.0 * float(sdfSample)) * halfRangePx;\n    float qx = cornerSize - dx;\n    float qy = cornerSize - dy;\n    float circleSdf = sqrt(qx * qx + qy * qy) - cornerSize;\n    float dist = mix(squircleSdf, circleSdf, blendWeight);\n    return color * half(smoothstep(0.5, -0.5, dist));\n}\n");
        this.f = new float[4];
        this.g = new float[4];
        this.h = new float[4];
    }

    @Override // defpackage.ut2
    public final Shader b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        float fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)) * 0.5f;
        float f = 0.7853982f * fMin;
        float f2 = fMin - f;
        int i3 = 0;
        while (true) {
            float[] fArr = this.h;
            float[] fArr2 = this.g;
            float[] fArr3 = this.f;
            if (i3 >= 4) {
                pf pfVar = this.e;
                pfVar.a.setColorUniform("color", xp1.T(this.c));
                pfVar.a.setFloatUniform("size", Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                pfVar.a.setFloatUniform("cornerSizes", fArr3);
                pfVar.a.setFloatUniform("halfRangesPx", fArr2);
                pfVar.a.setFloatUniform("blendWeights", fArr);
                pfVar.a.setFloatUniform("bitmapSize", 512.0f);
                Shader shader = (Shader) d03.a.getValue();
                shader.getClass();
                pfVar.a.setInputShader("cornerSdf", shader);
                return pfVar.a;
            }
            float f3 = this.d[i3];
            float fC = c(i3, j);
            fArr3[i3] = fC;
            fArr2[i3] = fC * 0.125f;
            float fU = 1.0f;
            if (f2 > 0.0f) {
                fU = mh0.u((f3 - f) / f2, 0.0f, 1.0f);
            }
            fArr[i3] = fU;
            i3++;
        }
    }

    public final float c(int i, long j) {
        return mh0.u(this.d[i], 0.0f, Math.min(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) * 0.5f);
    }
}
