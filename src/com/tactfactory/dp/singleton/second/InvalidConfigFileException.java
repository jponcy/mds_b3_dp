/**
 *
 */
package com.tactfactory.dp.singleton.second;

/**
 * @author Jonathan Poncy <jonathan.poncy@tactfactory.com>
 *
 */
public class InvalidConfigFileException extends Exception {

    /** The serial number. */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public InvalidConfigFileException() {
    }

    /**
     * @param arg0
     */
    public InvalidConfigFileException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public InvalidConfigFileException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InvalidConfigFileException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     */
    public InvalidConfigFileException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }

}
