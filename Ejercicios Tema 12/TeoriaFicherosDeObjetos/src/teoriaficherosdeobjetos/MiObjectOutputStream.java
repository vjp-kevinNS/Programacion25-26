package teoriaficherosdeobjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author KevinNS
 */
public class MiObjectOutputStream extends ObjectOutputStream {

    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    // ctrl + I -> Override Method -> writeStreamHeader()
    @Override
    protected void writeStreamHeader() throws IOException {
        // No hace nada
    }
}
