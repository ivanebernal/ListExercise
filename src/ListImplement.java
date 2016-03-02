import java.util.*;

/**
 * Created by ivan on 1/03/16.
 */
public class ListImplement implements List{
    String[] arreglo;

    public ListImplement(){
        this.arreglo = new String[100];
    }

    @Override
    public int size() {
        int i = 0;
        while(arreglo[i] != null){
            i++;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        if(arreglo[0] == null){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        int i=0;
        while(arreglo[i] != null){
            if(arreglo[i] == o){
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        //
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[100];
        int i = 0;
        while(this.get(i) != null){
            arr[i] = this.get(i);
            i++;
        }
        return arr;
    }

    @Override
    public boolean add(Object o) {
        int i = 0;
        while(true){
            if(arreglo[i] == null){
                arreglo[i] = (String) o;
                return true;
            }
            i++;
        }
    }

    @Override
    public Object[] toArray(Object[] objects) {
        //
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        int i=0;
        while(arreglo[i] != null){
            if(arreglo[i] == o){
                while(arreglo[i] != null){
                    arreglo[i] = arreglo[i+1];
                    i++;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        Object[] collArr = collection.toArray();
        int i = 0;
        int j = 0;
        if(collArr[0] != null) {
            while (arreglo[i] != null) {
                i++;
            }
            while (collArr[j] != null) {
                arreglo[i] = (String) collArr[j];
                i++;
                j++;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        Object[] arr = collection.toArray();
        int length = 0;
        int length1 = 0;
        String[] arreglo1 = arreglo.clone();

        while(arr[length] != null){
            length++;
        }
        while(arreglo[length1] != null){
            length1++;
        }

        for(int j = i; j<length1; j++){
            arreglo[j+length] = arreglo1[j];
        }

        for(int j = 0; j<length; j++){
            arreglo[j+i] = (String) arr[j];
        }

        return true;
    }

    @Override
    public void clear() {
        int i = 0;
        while(arreglo[i] != null){
            arreglo[i] = null;
            i++;
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        //
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        Object[] colArr = collection.toArray();
        int i = 0;
        int j = 0;
        int k;
        while (colArr[i] != null) {
            while(arreglo[j] != null){
                if(arreglo[j] == colArr[i]){
                    for(k = j; arreglo[k] != null; k++){
                        arreglo[k]= arreglo[k+1];
                    }
                    break;
                }
                j++;
            }
            i++;
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection collection) {
        //
        return false;
    }

    @Override
    public Object get(int i) {
        return arreglo[i];
    }

    @Override
    public Object set(int i, Object o) {
        if(arreglo[i-1] != null){
            arreglo[i] = (String) o;
        }
        return null;
    }

    @Override
    public void add(int i, Object o) {
        String[] arreglo1 = arreglo.clone();
        if(arreglo[i-1] != null || i == 0){
            arreglo[i] = (String) o;
            for(int j = i; j<size();j++){
                arreglo[j+1] = arreglo1[j];
            }
        }
    }

    @Override
    public Object remove(int i) {
        while(arreglo[i] != null){
            arreglo[i] = arreglo[i+1];
            i++;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int i=0;
        while(arreglo[i]!=null){
            if(arreglo[i] == o){
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        //
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        //
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        //
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        List l = new ListImplement();
        for(int j = i; j<i1; j++){
            l.add(arreglo[j]);
        }
        return l;
    }
}
