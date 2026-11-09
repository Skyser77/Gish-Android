/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;

final class f
implements Runnable {
    private Main a;

    private f(ad ad2, Main main) {
        this.a = main;
    }

    public final void run() {
        try {
            if (!Main.var_boolean_b) {
                return;
            }
            this.a.var_ad_a.b();
            this.a.var_ad_a.var_boolean_a = true;
            this.a.var_ad_a.m();
            this.a.var_ad_a.var_boolean_f = true;
            if (this.a.var_ar_a != null && this.a.var_ar_a.var_short_arr_arr_a != null) {
                this.a.var_d_b.b();
                this.a.var_d_b.c();
            }
            if (this.a.var_d_a != null) {
                this.a.var_d_a.e();
            }
            this.a.var_ad_a.var_boolean_f = false;
            this.a.var_ad_a.var_boolean_c = false;
            this.a.var_ad_a.var_boolean_a = false;
            if (this.a.var_byte_a != 1) {
                if (this.a.var_byte_a == 0 && this.a.var_ar_a.var_byte_c == 6) {
                    this.a.var_ar_a.var_ac_a.d();
                }
                return;
            }
            this.a.var_u_a.a(this.a.var_u_a.var_byte_a);
        }
        catch (Exception exception) {}
    }

    f(ad ad2, Main main, bc bc2) {
        this(ad2, main);
    }
}

