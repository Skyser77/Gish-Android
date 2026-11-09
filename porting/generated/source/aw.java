/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.DeviceClass
 *  javax.bluetooth.DiscoveryAgent
 *  javax.bluetooth.DiscoveryListener
 *  javax.bluetooth.LocalDevice
 *  javax.bluetooth.RemoteDevice
 *  javax.bluetooth.ServiceRecord
 */
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public final class aw
implements DiscoveryListener {
    private static DiscoveryAgent var_javax_bluetooth_DiscoveryAgent_a;
    private ay var_ay_a = null;
    private Vector var_java_util_Vector_b = null;
    public Vector var_java_util_Vector_a = null;
    public volatile boolean var_boolean_a = false;
    private volatile boolean var_boolean_b = true;
    private volatile int var_int_a = -1;

    public final void a(ay ay2) {
        if (this.var_boolean_a) {
            throw new IllegalStateException();
        }
        this.var_ay_a = ay2;
        this.var_boolean_a = true;
        try {
            this.var_java_util_Vector_b = new Vector();
            this.var_java_util_Vector_a = new Vector();
            this.var_boolean_b = false;
            this.var_int_a = -1;
            int n2 = 0;
            if (!aw.javax_bluetooth_DiscoveryAgent_a().startInquiry(10390323, (DiscoveryListener)this)) {
                throw new IOException();
            }
            this.b();
            if (this.var_int_a == -1 || this.var_int_a == 7) {
                throw new IOException();
            }
            n2 = 0;
            int n3 = this.var_java_util_Vector_b.size();
            int[] nArray = new int[2];
            Enumeration enumeration = this.var_java_util_Vector_b.elements();
            while (enumeration.hasMoreElements()) {
                nArray[0] = ++n2;
                nArray[1] = n3;
                this.var_ay_a.a(j.j_a().a(7, nArray));
                Object object = (RemoteDevice)enumeration.nextElement();
                String string = object.getBluetoothAddress();
                String string2 = null;
                for (int i2 = 0; string2 == null && i2 < 3; ++i2) {
                    try {
                        if (i2 > 0) {
                            try {
                                Thread.sleep(i2 * 1000);
                            }
                            catch (InterruptedException interruptedException) {}
                        }
                        string2 = object.getFriendlyName(true);
                        continue;
                    }
                    catch (IOException iOException) {}
                }
                if (string2 != null && (string2 = string2.trim()).length() <= 0) {
                    string2 = null;
                }
                String string3 = string2;
                if (string2 == null) {
                    string3 = string;
                }
                object = new ao(string3, (RemoteDevice)object);
                this.var_java_util_Vector_a.addElement(object);
            }
            return;
        }
        finally {
            this.var_boolean_a = false;
        }
    }

    public final void void_a() {
        aw.javax_bluetooth_DiscoveryAgent_a().cancelInquiry((DiscoveryListener)this);
    }

    private synchronized void b() {
        if (!this.var_boolean_b) {
            try {
                this.wait(60000L);
            }
            catch (InterruptedException interruptedException) {}
            if (!this.var_boolean_b) {
                try {
                    this.void_a();
                    try {
                        this.wait(5000L);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                catch (IOException iOException) {}
            }
        }
        if (!this.var_boolean_b) {
            this.var_boolean_b = true;
        }
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        switch (deviceClass.getMajorDeviceClass()) {
            case 256: 
            case 512: 
            case 768: {
                return;
            }
        }
        this.var_java_util_Vector_b.addElement(remoteDevice);
        int n2 = this.var_java_util_Vector_b.size();
        this.var_ay_a.a(j.j_a().a(6, new int[]{n2}));
    }

    public final synchronized void inquiryCompleted(int n2) {
        this.var_int_a = n2;
        this.var_boolean_b = true;
        this.notify();
    }

    public final void servicesDiscovered(int n2, ServiceRecord[] serviceRecordArray) {
        throw new IllegalStateException();
    }

    public final void serviceSearchCompleted(int n2, int n3) {
        throw new IllegalStateException();
    }

    static DiscoveryAgent javax_bluetooth_DiscoveryAgent_a() {
        if (var_javax_bluetooth_DiscoveryAgent_a == null) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {}
            LocalDevice localDevice = ao.javax_bluetooth_LocalDevice_a();
            if (localDevice == null) {
                throw new IOException();
            }
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {}
            var_javax_bluetooth_DiscoveryAgent_a = localDevice.getDiscoveryAgent();
        }
        return var_javax_bluetooth_DiscoveryAgent_a;
    }
}

