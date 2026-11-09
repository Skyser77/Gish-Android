/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.DeviceClass
 *  javax.bluetooth.DiscoveryListener
 *  javax.bluetooth.LocalDevice
 *  javax.bluetooth.RemoteDevice
 *  javax.bluetooth.ServiceRecord
 *  javax.bluetooth.UUID
 */
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;

final class ao
implements ah,
DiscoveryListener {
    private static final UUID[] var_javax_bluetooth_UUID_arr_a;
    private static final UUID[] var_javax_bluetooth_UUID_arr_b;
    private String var_java_lang_String_a = null;
    private RemoteDevice var_javax_bluetooth_RemoteDevice_a = null;
    private ah var_ah_a = null;
    private volatile boolean var_boolean_a = false;
    private volatile int var_int_a = -1;
    private int var_int_b;
    private Vector var_java_util_Vector_a;

    ao(String string, RemoteDevice remoteDevice) {
        this.var_java_lang_String_a = string;
        this.var_javax_bluetooth_RemoteDevice_a = remoteDevice;
    }

    public final String java_lang_String_b() {
        return this.ah_a().java_lang_String_b();
    }

    private ah ah_a() {
        if (this.var_ah_a == null) {
            String string = this.java_lang_String_c();
            if (string == null) {
                throw new IOException();
            }
            this.var_ah_a = w.a(this.var_java_lang_String_a, string);
        }
        return this.var_ah_a;
    }

    private String java_lang_String_c() {
        Object object = null;
        for (int i2 = 0; object == null && i2 < 3; ++i2) {
            if (i2 > 0) {
                try {
                    Thread.sleep(i2 * 1000);
                }
                catch (InterruptedException interruptedException) {}
            }
            ao ao2 = object = this;
            ((ao)object).var_java_util_Vector_a = new Vector();
            ao2.var_int_b = -1;
            ao2.var_boolean_a = false;
            ao2.var_int_a = -1;
            UUID[] uUIDArray = var_javax_bluetooth_UUID_arr_a;
            if (ao2.var_java_lang_String_a != null && ao2.var_java_lang_String_a.startsWith("ZeemoteLink")) {
                uUIDArray = var_javax_bluetooth_UUID_arr_b;
            }
            ao2.var_int_b = aw.javax_bluetooth_DiscoveryAgent_a().searchServices(null, uUIDArray, ao2.var_javax_bluetooth_RemoteDevice_a, (DiscoveryListener)ao2);
            if (ao2.var_int_b < 0) {
                throw new IOException();
            }
            ao2.void_c();
            object = ((ao)object).var_java_util_Vector_a.size() > 0 ? ((ServiceRecord)((ao)object).var_java_util_Vector_a.elementAt(0)).getConnectionURL(0, false) : null;
            if (object == null && this.var_int_a != 6) break;
        }
        return object;
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        throw new IllegalStateException();
    }

    public final void inquiryCompleted(int n2) {
        throw new IllegalStateException();
    }

    public final void servicesDiscovered(int n2, ServiceRecord[] serviceRecordArray) {
        for (n2 = 0; n2 < serviceRecordArray.length; ++n2) {
            this.var_java_util_Vector_a.addElement(serviceRecordArray[n2]);
        }
    }

    public final synchronized void serviceSearchCompleted(int n2, int n3) {
        this.var_int_a = n3;
        this.var_boolean_a = true;
        this.notify();
    }

    private synchronized void void_c() {
        if (!this.var_boolean_a) {
            try {
                this.wait(60000L);
            }
            catch (InterruptedException interruptedException) {}
            if (!this.var_boolean_a) {
                try {
                    ao ao2 = this;
                    if (aw.javax_bluetooth_DiscoveryAgent_a().cancelServiceSearch(ao2.var_int_b)) {
                        try {
                            this.wait(5000L);
                        }
                        catch (InterruptedException interruptedException) {}
                    }
                }
                catch (IOException iOException) {}
            }
        }
        if (!this.var_boolean_a) {
            this.var_boolean_a = true;
        }
    }

    static boolean a(String string) {
        return string != null && string.length() >= "btspp:".length() && string.substring(0, "btspp:".length()).equalsIgnoreCase("btspp:");
    }

    static LocalDevice javax_bluetooth_LocalDevice_a() {
        LocalDevice localDevice = null;
        try {
            localDevice = LocalDevice.getLocalDevice();
        }
        catch (NullPointerException nullPointerException) {}
        return localDevice;
    }

    public final void void_a() {
        this.ah_a().void_a();
    }

    public final void void_b() {
        if (this.var_ah_a != null) {
            this.var_ah_a.void_b();
        }
    }

    public final String java_lang_String_a() {
        return this.var_java_lang_String_a;
    }

    public final boolean boolean_a() {
        if (this.var_ah_a != null) {
            return this.var_ah_a.boolean_a();
        }
        return false;
    }

    public final byte[] byte_arr_a(byte[] byArray) {
        if (this.var_ah_a != null) {
            return this.var_ah_a.byte_arr_a(byArray);
        }
        throw new IOException();
    }

    public final void a(r r2) {
        if (this.var_ah_a != null) {
            this.var_ah_a.a(r2);
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean boolean_b() {
        return this.ah_a().boolean_b();
    }

    public final void void_a(byte[] byArray) {
        if (this.var_ah_a != null) {
            this.var_ah_a.void_a(byArray);
            return;
        }
        throw new IOException();
    }

    static {
        var_javax_bluetooth_UUID_arr_a = new UUID[]{new UUID("8e1f0cf7508f4875b62cfbb67fd34812", false)};
        var_javax_bluetooth_UUID_arr_b = new UUID[]{new UUID(4353L)};
    }
}

