package DET;

public class ReadWrite extends ReadOnly {
    private boolean dirty;

    public ReadWrite(int val) {
        super(val);
        this.dirty = false;
    }

    public void setVal(int newVal) {
        val = newVal;
        dirty = true;
    }

    public boolean isDirty() {
        return dirty;
    }
}
