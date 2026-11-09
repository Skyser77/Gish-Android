/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.DataElement
 *  javax.bluetooth.DiscoveryAgent
 *  javax.bluetooth.DiscoveryListener
 *  javax.bluetooth.L2CAPConnection
 *  javax.bluetooth.L2CAPConnectionNotifier
 *  javax.bluetooth.LocalDevice
 *  javax.bluetooth.RemoteDevice
 *  javax.bluetooth.ServiceRecord
 *  javax.bluetooth.UUID
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DataElement;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;

public final class at
implements Runnable {
    private int var_int_b;
    private int var_int_c;
    private L2CAPConnection var_javax_bluetooth_L2CAPConnection_a;
    LocalDevice var_javax_bluetooth_LocalDevice_a;
    private L2CAPConnectionNotifier var_javax_bluetooth_L2CAPConnectionNotifier_a = null;
    Vector var_java_util_Vector_a;
    private String var_java_lang_String_a;
    int var_int_a;
    byte var_byte_a;
    byte var_byte_b;
    private u var_u_a;
    private boolean var_boolean_b = false;
    public boolean var_boolean_a;
    private boolean var_boolean_c = false;

    public at(u u2) {
        this.var_u_a = u2;
    }

    void void_a() {
        if (this.var_boolean_c) {
            return;
        }
        try {
            this.var_javax_bluetooth_LocalDevice_a = LocalDevice.getLocalDevice();
            this.var_java_lang_String_a = this.var_javax_bluetooth_LocalDevice_a.getFriendlyName();
            if (this.var_java_lang_String_a == null || this.var_java_lang_String_a.length() == 0 || this.var_java_lang_String_a.compareTo(" ") == 0) {
                this.var_java_lang_String_a = "unknown";
            } else {
                StringBuffer stringBuffer = new StringBuffer(this.var_java_lang_String_a);
                int n2 = stringBuffer.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    char c2 = stringBuffer.charAt(i2);
                    if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || c2 >= '0' && c2 <= '9') continue;
                    stringBuffer.setCharAt(i2, '_');
                }
                this.var_java_lang_String_a = stringBuffer.toString();
            }
            this.var_boolean_c = true;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        switch (this.var_byte_b) {
            case 1: {
                at at2 = this;
                boolean bl = false;
                try {
                    DiscoveryAgent discoveryAgent = at2.var_javax_bluetooth_LocalDevice_a.getDiscoveryAgent();
                    at2.var_javax_bluetooth_LocalDevice_a.setDiscoverable(0);
                    z z2 = new z(at2);
                    Object object = z2;
                    synchronized (z2) {
                        discoveryAgent.startInquiry(10390323, (DiscoveryListener)z2);
                        try {
                            z2.wait();
                        }
                        catch (InterruptedException interruptedException) {}
                        object = z2.a.elements();
                        while (object.hasMoreElements()) {
                            z z3 = z2;
                            synchronized (z3) {
                                discoveryAgent.searchServices(new int[]{256}, new UUID[]{new UUID("01834587449266546213012382234327", false)}, (RemoteDevice)object.nextElement(), (DiscoveryListener)z2);
                                try {
                                    z2.wait();
                                }
                                catch (InterruptedException interruptedException) {}
                            }
                        }
                        try {
                            Thread.sleep(1L);
                        }
                        catch (InterruptedException interruptedException) {}
                        at2.var_java_util_Vector_a = z2.b;
                    }
                }
                catch (Exception exception) {
                    bl = true;
                }
                {
                    at2.var_u_a.a(bl);
                    return;
                }
            }
            case 0: {
                at at3 = this;
                boolean bl = false;
                Main.var_boolean_c = false;
                if (at3.var_boolean_b) {
                    try {
                        at3.var_javax_bluetooth_LocalDevice_a.setDiscoverable(10390323);
                    }
                    catch (Exception exception) {}
                    Main.var_boolean_c = true;
                    break;
                }
                try {
                    at3.var_javax_bluetooth_LocalDevice_a.setDiscoverable(10390323);
                    String string = "btl2cap://localhost:01834587449266546213012382234327;ReceiveMTU=512;TransmitMTU=512;authenticate=true;authorize=true;encrypt=false;name=" + at3.var_java_lang_String_a;
                    at3.var_javax_bluetooth_L2CAPConnectionNotifier_a = (L2CAPConnectionNotifier)Connector.open((String)string);
                    ServiceRecord serviceRecord = at3.var_javax_bluetooth_LocalDevice_a.getRecord((Connection)at3.var_javax_bluetooth_L2CAPConnectionNotifier_a);
                    serviceRecord.setAttributeValue(8, new DataElement(8, 255L));
                    serviceRecord.setDeviceServiceClasses(0x400000);
                }
                catch (Exception exception) {
                    bl = true;
                }
                Main.var_boolean_c = true;
                at3.var_u_a.b(bl);
                if (!bl) {
                    at3.var_boolean_b = true;
                    try {
                        at3.var_javax_bluetooth_L2CAPConnection_a = at3.var_javax_bluetooth_L2CAPConnectionNotifier_a.acceptAndOpen();
                        at3.var_int_b = at3.var_javax_bluetooth_L2CAPConnection_a.getReceiveMTU();
                        at3.var_int_c = at3.var_javax_bluetooth_L2CAPConnection_a.getTransmitMTU();
                        at3.var_boolean_b = false;
                        at3.var_boolean_a = false;
                        Main.var_boolean_c = false;
                        try {
                            at3.var_javax_bluetooth_LocalDevice_a.setDiscoverable(0);
                            at3.var_javax_bluetooth_L2CAPConnectionNotifier_a.close();
                        }
                        catch (Exception exception) {}
                        Main.var_boolean_c = true;
                    }
                    catch (Exception exception) {
                        bl = true;
                    }
                }
                at3.var_u_a.c(bl);
                return;
            }
            case 2: {
                at at4 = this;
                boolean bl = false;
                Main.var_boolean_c = false;
                try {
                    ServiceRecord serviceRecord = (ServiceRecord)at4.var_java_util_Vector_a.elementAt(at4.var_int_a);
                    String string = serviceRecord.getConnectionURL(1, false);
                    if (string.indexOf("ReceiveMTU") == -1) {
                        string = string + ";ReceiveMTU=512";
                    }
                    if (string.indexOf("TransmitMTU") == -1) {
                        string = string + ";TransmitMTU=512";
                    }
                    at4.var_javax_bluetooth_L2CAPConnection_a = (L2CAPConnection)Connector.open((String)string);
                    at4.var_int_b = at4.var_javax_bluetooth_L2CAPConnection_a.getReceiveMTU();
                    at4.var_int_c = at4.var_javax_bluetooth_L2CAPConnection_a.getTransmitMTU();
                    at4.var_boolean_a = false;
                }
                catch (Exception exception) {
                    bl = true;
                }
                Main.var_boolean_c = true;
                at4.var_u_a.d(bl);
            }
        }
    }

    public final void b() {
        try {
            this.var_boolean_a = true;
            this.var_javax_bluetooth_L2CAPConnection_a.close();
        }
        catch (Exception exception) {}
        try {
            this.var_javax_bluetooth_LocalDevice_a.setDiscoverable(0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final ByteArrayInputStream java_io_ByteArrayInputStream_a() {
        try {
            Object object = new byte[this.var_int_b];
            this.var_javax_bluetooth_L2CAPConnection_a.receive(object);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            object = byteArrayInputStream;
            return byteArrayInputStream;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final boolean boolean_a() {
        if (this.var_boolean_a) {
            return true;
        }
        try {
            return this.var_javax_bluetooth_L2CAPConnection_a.ready();
        }
        catch (IOException iOException) {
            return true;
        }
    }

    public final boolean a(byte[] byArray) {
        try {
            this.var_javax_bluetooth_L2CAPConnection_a.send(byArray);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

