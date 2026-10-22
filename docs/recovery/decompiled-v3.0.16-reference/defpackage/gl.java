package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gl extends ImageButton {
    public final fk e;
    public final q01 f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qa3.a(context);
        this.g = false;
        ca3.a(this, getContext());
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, i);
        q01 q01Var = new q01(this);
        this.f = q01Var;
        q01Var.i(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.b();
        }
        q01 q01Var = this.f;
        if (q01Var != null) {
            q01Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.q();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        u40 u40Var;
        q01 q01Var = this.f;
        if (q01Var == null || (u40Var = (u40) q01Var.d) == null) {
            return null;
        }
        return (ColorStateList) u40Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        u40 u40Var;
        q01 q01Var = this.f;
        if (q01Var == null || (u40Var = (u40) q01Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) u40Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.t(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q01 q01Var = this.f;
        if (q01Var != null) {
            q01Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q01 q01Var = this.f;
        if (q01Var != null && drawable != null && !this.g) {
            q01Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (q01Var != null) {
            q01Var.b();
            if (this.g) {
                return;
            }
            ImageView imageView = (ImageView) q01Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(q01Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.g = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        q01 q01Var = this.f;
        ImageView imageView = (ImageView) q01Var.c;
        if (i != 0) {
            Drawable drawableV = k22.v(imageView.getContext(), i);
            if (drawableV != null) {
                pg0.a(drawableV);
            }
            imageView.setImageDrawable(drawableV);
        } else {
            imageView.setImageDrawable(null);
        }
        q01Var.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q01 q01Var = this.f;
        if (q01Var != null) {
            q01Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.y(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q01 q01Var = this.f;
        if (q01Var != null) {
            u40 u40Var = (u40) q01Var.d;
            if (u40Var == null) {
                u40Var = new u40();
                q01Var.d = u40Var;
            }
            u40Var.c = colorStateList;
            u40Var.b = true;
            q01Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q01 q01Var = this.f;
        if (q01Var != null) {
            u40 u40Var = (u40) q01Var.d;
            if (u40Var == null) {
                u40Var = new u40();
                q01Var.d = u40Var;
            }
            u40Var.d = mode;
            u40Var.a = true;
            q01Var.b();
        }
    }
}
