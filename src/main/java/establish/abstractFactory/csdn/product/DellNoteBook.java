package establish.abstractFactory.csdn.product;

/**
 * Dell笔记本(具体产品)
 */
public class DellNoteBook implements NoteBook{
    public void getNoteBook() {
        System.out.println("获取Dell笔记本");
    }
}
