package sem3hwtask1;

import java.util.Iterator;
//import task3.MyLinkedList;

public class Main 
{

    public static void main(String[] args) 
    {
        
        int[] numbers={1,2,3,4,3,3,3,22,22,3,5};
        MyLinkedList list=new MyLinkedList(numbers);
        Iterator <Integer> myit=list.iterator();
        list.addElement(100);

        System.out.println("List before deletition");                    


        for(int num: list)
        {            
            System.out.println(num);       
        }

        for(int num: list)
        {            
               if(num==3) 
               {
                list.RemoveElement(num);
                
                /* непонятно как в результате вызывать iterator.remove, при вызове в явном виде
                 currentIndex сбрасывается в ноль и всегда удаляется только нулевой элемент.
                Как вызвать remove в цикле чтобы в экземпляре класса был актуальный индекс элемента?
                */
                //myit.remove();
               }
        }

        System.out.println("List after deletition");                    


        for(int num: list)
        {
            System.out.println(num);                    
        }



        
            

            

        

    }
    
    
}
