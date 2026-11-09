/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class al
extends InputStream {
    private InputStream var_java_io_InputStream_a;
    private byte[] var_byte_arr_a;
    private int var_int_a = 0;
    private int b = 0;

    al(InputStream inputStream) {
        this(inputStream, 500);
    }

    private al(InputStream inputStream, int n2) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        this.var_java_io_InputStream_a = inputStream;
        this.var_byte_arr_a = new byte[500];
    }

    public final int read() {
        if (this.var_int_a >= this.b) {
            int n2 = this.var_java_io_InputStream_a.read(this.var_byte_arr_a);
            if (n2 == -1) {
                return -1;
            }
            this.var_int_a = 0;
            this.b = n2;
        }
        return this.var_byte_arr_a[this.var_int_a++] & 0xFF;
    }

    public final int available() {
        return this.b - this.var_int_a + this.var_java_io_InputStream_a.available();
    }

    public final long skip(long l2) {
        return 0L;
    }

    public final void close() {
        this.var_java_io_InputStream_a.close();
    }
}

