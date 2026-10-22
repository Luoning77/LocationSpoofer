package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class fv implements k81, Serializable {
    public static final Object NO_RECEIVER = ev.e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient k81 reflected;
    private final String signature;

    public fv(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.k81
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.k81
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public k81 compute() {
        k81 k81Var = this.reflected;
        if (k81Var != null) {
            return k81Var;
        }
        k81 k81VarComputeReflected = computeReflected();
        this.reflected = k81VarComputeReflected;
        return k81VarComputeReflected;
    }

    public abstract k81 computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        n81 owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof mx)) {
            return null;
        }
        String strZ0 = l13.z0(signature, '(');
        if (strZ0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((mx) owner).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (o51.f(method.getName(), strZ0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    ig0.h(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                ig0.h(sb, returnType);
                if (sb.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // defpackage.j81
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public n81 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return xe2.a(cls);
        }
        xe2.a.getClass();
        return new w42(cls);
    }

    @Override // defpackage.k81
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract k81 getReflected();

    @Override // defpackage.k81
    public z81 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.k81
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.k81
    public a91 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.k81
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.k81
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.k81
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.k81, defpackage.o81
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
