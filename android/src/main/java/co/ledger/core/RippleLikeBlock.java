// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

package co.ledger.core;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/**Class representing Bitcoin block */
public abstract class RippleLikeBlock {
    /**
     *Hash of block
     *@return string representing hash of this block
     */
    public abstract String getHash();

    /**
     *Height of block in blockchain
     *@return 64 bits integer, height of block
     */
    public abstract long getHeight();

    /**
     *Timestamp when block was mined
     *@return Date object, date when block was appended to blockchain
     */
    public abstract Date getTime();

    private static final class CppProxy extends RippleLikeBlock
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
        public String getHash()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getHash(this.nativeRef);
        }
        private native String native_getHash(long _nativeRef);

        @Override
        public long getHeight()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getHeight(this.nativeRef);
        }
        private native long native_getHeight(long _nativeRef);

        @Override
        public Date getTime()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getTime(this.nativeRef);
        }
        private native Date native_getTime(long _nativeRef);
    }
}
