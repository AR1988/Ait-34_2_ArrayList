package collection;

/**
 * @author Andrej Reutow
 * created on 09.11.2023
 */
public interface MyList<E> {
    // Добавляем элемент и увеличиваем размер массива, если нужно
   void add(E o);

    // Получаем элемент по индексу
    E get (int index);

    // устанавливает объект по индексу, смещая объекты
    void set(E o, int index);

    // Возвращаем размер коллекции
   int size();

   // проверяет есть ли элемент
   boolean contains(E o);

    // Удаляем элемент по значению
    boolean remove(E o);

    // Удаляем элемент по индексу
    E removeByIndex(int index);
}
