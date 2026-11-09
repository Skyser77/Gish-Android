/*
 * Decompiled with CFR 0.152.
 */
public final class w {
    private static ae a;

    private w() {
    }

    public static ah a(String object, String string) {
        String string2 = string;
        string = object;
        object = w.ae_a();
        object = new be(string, string2);
        boolean bl = true;
        be be2 = object;
        ((be)object).var_boolean_a = true;
        return object;
    }

    public static ae ae_a() {
        if (a == null) {
            boolean bl = w.boolean_a();
            try {
                if (bl) {
                    Object var0_1 = null;
                    a = (ae)Class.forName("com.zeemote.zc.c").newInstance();
                } else {
                    a = (ae)Class.forName("ae").newInstance();
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new RuntimeException();
            }
            catch (InstantiationException instantiationException) {
                throw new RuntimeException();
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException();
            }
        }
        return a;
    }

    static boolean boolean_a() {
        try {
            Class.forName("net.rim.device.api.system.Device");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }
}

