// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DerivationPath {
    /** Get the number of element in this path. */
    public abstract int getDepth();

    /** Get the child num at the given index in the path. */
    public abstract int getChildNum(int index);

    /**
     * Get the child num at the given index in the path. If the child num is hardened, returns it
     * without the hardened marker bit.
     */
    public abstract int getUnhardenedChildNum(int index);

    /** Return true if the given index in the path is an hardened child num. */
    public abstract boolean isHardened(int index);

    /** Serialize the given path to a human readable string like "44'/0'/0'/0/0". */
    public abstract String toString();

    /**
     * Return a derivation path without the last element, e.g. the parent of "44'/0'/0'/0/0" is
     * "44'/0'/0'/0".
     */
    public abstract DerivationPath getParent();

    /** Return an array where which item is a child num of the path. */
    public abstract ArrayList<Integer> toArray();

    public static native DerivationPath parse(String path);

    private static final class CppProxy extends DerivationPath
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public int getDepth()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getDepth(this.nativeRef);
        }
        private native int native_getDepth(long _nativeRef);

        @Override
        public int getChildNum(int index)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getChildNum(this.nativeRef, index);
        }
        private native int native_getChildNum(long _nativeRef, int index);

        @Override
        public int getUnhardenedChildNum(int index)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getUnhardenedChildNum(this.nativeRef, index);
        }
        private native int native_getUnhardenedChildNum(long _nativeRef, int index);

        @Override
        public boolean isHardened(int index)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_isHardened(this.nativeRef, index);
        }
        private native boolean native_isHardened(long _nativeRef, int index);

        @Override
        public String toString()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_toString(this.nativeRef);
        }
        private native String native_toString(long _nativeRef);

        @Override
        public DerivationPath getParent()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getParent(this.nativeRef);
        }
        private native DerivationPath native_getParent(long _nativeRef);

        @Override
        public ArrayList<Integer> toArray()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_toArray(this.nativeRef);
        }
        private native ArrayList<Integer> native_toArray(long _nativeRef);
    }
}
