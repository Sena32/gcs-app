package valores;

public class Valores implements ValoresITF{
    int[] myList = new int[10];
    @Override
    public boolean ins(int v) {
        if(v>0){
            for (int i = 0; i < myList.length; i++){
                if(myList[i]==0){
                    myList[i] = v;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int del(int i) {
        int aux = 0;
        boolean flag = false;
        // verificando se a posição atual está vazia
        if(myList[i]==0) return  -1;

        // verificando se o array esta sem elementos
        for (int a = 0; a < myList.length; a++) {
            if (myList[a] != 0) {
                flag = true;
            }
        }
        if (flag) {
            if (i >= 0 && i <= 9) {
                aux = myList[i];
                myList[i] = 0;
            }
            return aux;
        }else {
            return -1;
        }
    }


    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i]!=0) {
               size++;
            }
        }
        return size;
    }

}
