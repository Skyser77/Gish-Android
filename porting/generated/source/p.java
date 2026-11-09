/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 */
import com.hardwire.blob.Main;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class p
implements Runnable {
    private Main var_com_hardwire_blob_Main_a;
    byte[] var_byte_arr_a;
    String var_java_lang_String_a;
    private boolean var_boolean_a;
    byte var_byte_a;
    private HttpConnection var_javax_microedition_io_HttpConnection_a = null;

    /*
     * Loose catch block
     */
    public final void run() {
        StringBuffer stringBuffer;
        block37: {
            OutputStream outputStream;
            InputStream inputStream;
            block36: {
                String string = "http://hardwire.cz:80/gish/";
                switch (this.var_byte_a) {
                    case 0: {
                        string = string + "upload_score.php";
                    }
                }
                string = string.replace(' ', '+');
                Main.var_boolean_c = false;
                this.var_javax_microedition_io_HttpConnection_a = null;
                inputStream = null;
                outputStream = null;
                stringBuffer = null;
                this.var_boolean_a = false;
                this.var_javax_microedition_io_HttpConnection_a = (HttpConnection)Connector.open((String)string, (int)3);
                if (this.var_byte_arr_a == null) break block36;
                this.var_javax_microedition_io_HttpConnection_a.setRequestProperty("Content-Type", "application/octet-stream");
                this.var_javax_microedition_io_HttpConnection_a.setRequestProperty("Content-Length", Integer.toString(this.var_byte_arr_a.length + (this.var_java_lang_String_a == null ? 0 : this.var_java_lang_String_a.length())));
                this.var_javax_microedition_io_HttpConnection_a.setRequestMethod("POST");
                outputStream = this.var_javax_microedition_io_HttpConnection_a.openOutputStream();
                if (this.var_java_lang_String_a != null) {
                    outputStream.write(this.var_java_lang_String_a.getBytes());
                }
                outputStream.write(this.var_byte_arr_a);
                int n2 = this.var_javax_microedition_io_HttpConnection_a.getResponseCode();
                switch (n2) {
                    case 200: 
                    case 201: {
                        stringBuffer = new StringBuffer();
                        inputStream = this.var_javax_microedition_io_HttpConnection_a.openInputStream();
                        while ((n2 = inputStream.read()) != -1) {
                            stringBuffer.append((char)n2);
                        }
                        if (stringBuffer.toString().compareTo("ok") == 0) break;
                        this.var_boolean_a = true;
                        break;
                    }
                    default: {
                        this.var_boolean_a = true;
                    }
                }
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (this.var_javax_microedition_io_HttpConnection_a != null) {
                    this.var_javax_microedition_io_HttpConnection_a.close();
                }
            }
            catch (IOException iOException) {}
            this.var_javax_microedition_io_HttpConnection_a = null;
            break block37;
            catch (Exception exception) {
                try {
                    this.var_boolean_a = true;
                }
                catch (Throwable throwable) {
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (this.var_javax_microedition_io_HttpConnection_a != null) {
                            this.var_javax_microedition_io_HttpConnection_a.close();
                        }
                    }
                    catch (IOException iOException) {}
                    this.var_javax_microedition_io_HttpConnection_a = null;
                    throw throwable;
                }
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (this.var_javax_microedition_io_HttpConnection_a != null) {
                        this.var_javax_microedition_io_HttpConnection_a.close();
                    }
                }
                catch (IOException iOException) {}
                this.var_javax_microedition_io_HttpConnection_a = null;
            }
        }
        Main.var_boolean_c = true;
        if (stringBuffer != null && stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == '\u0000') {
            stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
        }
        if (stringBuffer != null && stringBuffer.toString().compareTo("ok") != 0) {
            this.var_boolean_a = true;
        }
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {}
        if (this.var_boolean_a) {
            this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)34);
        } else {
            switch (this.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)35);
                }
            }
        }
        this.var_java_lang_String_a = null;
        this.var_byte_arr_a = null;
    }

    public p(Main main) {
        this.var_com_hardwire_blob_Main_a = main;
    }
}

