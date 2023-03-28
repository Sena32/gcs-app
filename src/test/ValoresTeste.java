package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import valores.Valores;

import static org.junit.Assert.assertEquals;

public class ValoresTeste {
        private Valores val;

        @Before
        public void setUP() throws Exception {
            val = new Valores();
            val.ins(5);
            val.ins(12);
            val.ins(1);
            val.ins(30);
            val.ins(152);
            val.ins(6);
        }

    @Test
    public void testSize() {
        val.ins(7);
        Assert.assertEquals(7, val.size());
        val.del(0);
        val.del(1);
        val.del(2);
        val.del(3);
        val.del(4);
        val.del(5);
        val.del(6);
        Assert.assertEquals(0, val.size());
    }
        @Test
        public void testIns() {
            Assert.assertEquals(false, val.ins(-10));
            Assert.assertEquals(false, val.ins(0));
            val.ins(2);
            Assert.assertEquals(7, val.size());
            val.ins(3);
            Assert.assertEquals(8, val.size());
            val.ins(4);
            Assert.assertEquals(9, val.size());
            val.ins(5);
            Assert.assertEquals(10, val.size());
            Assert.assertEquals(false, val.ins(11));
        }

        @Test
        public void testDel() {
            Assert.assertEquals(5, val.del(0));
            Assert.assertEquals(152, val.del(4));
            Assert.assertEquals(-1, val.del(4));
            Assert.assertEquals(-1, val.del(0));
            Assert.assertEquals(4, val.size());
            val.del(1);
            val.del(2);
            val.del(3);
            val.del(5);
            Assert.assertEquals(0, val.size());
            Assert.assertEquals(-1, val.del(0));
            Assert.assertEquals(-1, val.del(3));
        }
}
