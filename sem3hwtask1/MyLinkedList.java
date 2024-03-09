package sem3hwtask1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Итератор и итерируемость (Iterable):

Создайте класс MyLinkedList, который будет представлять собой простую односвязную цепочку.
Реализуйте интерфейс Iterable для этого класса. Это позволит перебирать элементы списка с 
помощью цикла for-each.
Напишите методы добавления, удаления и получения элементов из списка в классе MyLinkedList.
Создайте тестовый класс для проверки функциональности MyLinkedList, включая использование 
цикла for-each для перебора элементов списка.
Компаратор и компарируемость (Comparator и Comparable):

 */

public class MyLinkedList implements Iterable<Integer>
{
    //private int[] elements;
    ArrayList<Integer> elementss=new ArrayList<>();
   
   public MyLinkedList(int[] elements)
   {
    
    for (int index = 0; index < elements.length; index++) 
       {
         elementss.add(elements[index]);         
       }

   }

   public void addElement(int newElement)
  {
    elementss.add(newElement);
  }

  public void RemoveElement(int Element)
  {
    
    for (int index = 0; index < elementss.size(); index++) 
       {
         if(elementss.get(index)==Element) 
         {
            System.out.println("remove element:"+elementss.get(index));
            elementss.remove(index);
         }
       }
  }


   
   @Override
   public Iterator<Integer> iterator()
   {  

    
    return new Iterator<Integer>()
        {
            private int currentIndex=0;

            @Override 
            public boolean hasNext()
            {
                return currentIndex < elementss.size();
            }  
        
            @Override
            public Integer next()
            {
                return elementss.get(currentIndex++);
            }


           /* непонятно как в результате вызывать iterator.remove, при вызове в явном виде
            currentIndex сбрасывает в ноль и всегда удаляется только нулевой элемент.
            Как вызвать remove в цикле чтобы в экземпляре класса был актуальный индекс элемента?
            */

            // @Override
            // public void remove()
            // {
            //     System.out.println("current index to delete:"+currentIndex);
            //     System.out.println("value to delete:"+elementss.get(currentIndex));
            //     elementss.remove(currentIndex);
            //     System.out.println("value after delete:"+elementss.get(currentIndex));
                
            // }

        };

    
    
    
   }
    
}
