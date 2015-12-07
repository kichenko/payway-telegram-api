package com.payway.telegram.api.tl.core;

/**
 * TL Vector of integers. @see org.telegram.tl.TLVector
 *
 * @author
 * @created 07.12.2015
 */
public class TLIntVector extends TLVector<Integer> {

    private static final long serialVersionUID = -2523128521175192053L;

    public TLIntVector() {
        setDestClass(Integer.class);
    }

    @Override
    public String toString() {
        return "vector<int>#1cb5c415";
    }

    public int[] toIntArray() {
        int[] res = new int[size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = get(i);
        }
        return res;
    }
}
