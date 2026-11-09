/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.BluetoothConnectionException
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 *  javax.microedition.io.StreamConnection
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.bluetooth.BluetoothConnectionException;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

final class be
implements ah {
    private String var_java_lang_String_a = null;
    private String b = null;
    private Connection var_javax_microedition_io_Connection_a = null;
    private StreamConnection var_javax_microedition_io_StreamConnection_a;
    private InputStream var_java_io_InputStream_a;
    private OutputStream var_java_io_OutputStream_a;
    boolean var_boolean_a = true;

    public be(String string, String string2) {
        this.var_java_lang_String_a = string;
        this.b = string2;
    }

    public final String java_lang_String_b() {
        return this.b;
    }

    public final void void_a() {
        Object object = this;
        object = ((be)object).b;
        if (object == null) {
            throw new IOException();
        }
        try {
            if (ao.a((String)object)) {
                ao.javax_bluetooth_LocalDevice_a();
            }
            for (int i2 = 0; this.var_javax_microedition_io_Connection_a == null && i2 < 1; ++i2) {
                try {
                    this.var_javax_microedition_io_Connection_a = Connector.open((String)object);
                    continue;
                }
                catch (BluetoothConnectionException bluetoothConnectionException) {
                    BluetoothConnectionException bluetoothConnectionException2 = bluetoothConnectionException;
                    if (bluetoothConnectionException.getStatus() == 5) continue;
                    throw bluetoothConnectionException2;
                }
            }
            if (this.var_javax_microedition_io_Connection_a == null) {
                throw new IOException();
            }
            if (this.var_javax_microedition_io_Connection_a instanceof StreamConnection) {
                this.var_javax_microedition_io_StreamConnection_a = (StreamConnection)this.var_javax_microedition_io_Connection_a;
                this.var_java_io_InputStream_a = this.var_boolean_a ? new al(this.var_javax_microedition_io_StreamConnection_a.openInputStream()) : this.var_javax_microedition_io_StreamConnection_a.openInputStream();
                this.var_java_io_OutputStream_a = this.var_javax_microedition_io_StreamConnection_a.openOutputStream();
                return;
            }
            throw new IOException();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException();
        }
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException();
        }
    }

    public final void void_b() {
        try {
            if (this.var_java_io_InputStream_a != null) {
                this.var_java_io_InputStream_a.close();
                this.var_java_io_InputStream_a = null;
            }
            if (this.var_java_io_OutputStream_a != null) {
                this.var_java_io_OutputStream_a.close();
                this.var_java_io_OutputStream_a = null;
            }
            if (this.var_javax_microedition_io_Connection_a != null) {
                this.var_javax_microedition_io_Connection_a.close();
                this.var_javax_microedition_io_Connection_a = null;
            }
            return;
        }
        finally {
            this.var_java_io_InputStream_a = null;
            this.var_java_io_OutputStream_a = null;
            this.var_javax_microedition_io_Connection_a = null;
            this.var_javax_microedition_io_StreamConnection_a = null;
        }
    }

    public final boolean boolean_a() {
        return this.var_javax_microedition_io_Connection_a != null;
    }

    public final String java_lang_String_a() {
        return this.var_java_lang_String_a;
    }

    public final boolean boolean_b() {
        return false;
    }

    public final void a(r r2) {
        throw new RuntimeException();
    }

    public final byte[] byte_arr_a(byte[] byArray) {
        int n2 = 0;
        Object var4_3 = null;
        n2 = this.var_java_io_InputStream_a.read();
        if (n2 < 0) {
            return null;
        }
        if (byArray == null || byArray.length < n2 + 1) {
            byArray = new byte[n2 + 1];
        }
        byArray[0] = (byte)n2;
        for (int i2 = 1; i2 <= n2; ++i2) {
            var4_3 = null;
            int n3 = this.var_java_io_InputStream_a.read();
            if (n3 < 0) {
                return null;
            }
            byArray[i2] = (byte)n3;
        }
        return byArray;
    }

    public final void void_a(byte[] byArray) {
        this.var_java_io_OutputStream_a.write(byArray);
        this.var_java_io_OutputStream_a.flush();
    }
}

