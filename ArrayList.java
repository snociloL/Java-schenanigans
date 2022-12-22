/*public class ArrayList <E>{

    private int size = 0;
    public static int INITIAL_CAPACITY = 1;
    private E[] data = (E[]) (new Object[INITIAL_CAPACITY]);

    public ArrayList(){}      

    public int size(){ return this.size; }

    private void ensureCapacity()
    {
        if(this.size >= this.data.length)
        {
            E[] newData = (E[]) (new Object[this.size * 2 + 1]);
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data=newData;
        }
    }

    public void add(E element) {
        this.ensureCapacity();        
        this.data[this.size++] = element;        
    }   

    public E get(int index) {
        return this.data[index];
    }

    public void clear() {
        this.data = (E[]) (new Object[this.INITIAL_CAPACITY]);
        this.size=0;     
    }

    public E set(int index, E element) {
        E old = this.data[index];
        this.data[index] = element;        
        return old;
    }   

    public boolean contains(E element) {
        for (int i=0; i<size; i++)
            if(element.equals(data[i])) 
                return true;
        return false;
    }
}/***End of ArrayList Definition***/ 