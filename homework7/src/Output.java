import com.oocourse.TimableOutput;

/*下面的类主要是实现对电梯和人员状态的输出，调用了给的输出包。*/
public class Output {
    //下面的方法是实现对输出函数的初始化（时间戳）
    public static void printInit() {
        TimableOutput.initStartTimestamp();
    }
    
    /*下面的方法是实现在电梯开门时输出状态
     *输入：电梯当时的楼层f
     *输出：[时间戳]OPEN-楼层
     */
    public static synchronized void printOpen(int f, char c) {
        TimableOutput.println(String.format("OPEN-%d-%c", f, c));
    }
    
    /*下面的方法是实现在电梯到达时输出状态
     *注意在电梯到达一层时首先要调用这个函数输出状态再调用开关门函数
     *输入：电梯当时的楼层f
     *输出：[时间戳]ARRIVE-楼层
     */
    public static synchronized void printArrive(int f, char c) {
        TimableOutput.println(String.format("ARRIVE-%d-%c", f, c));
    }
    
    /*下面的方法是实现在电梯关门时输出状态
     *输入：电梯当时的楼层f
     *输出：[时间戳]CLOSE-楼层
     */
    public static synchronized void printClose(int f, char c) {
        TimableOutput.println(String.format("CLOSE-%d-%c", f, c));
    }
    
    /*下面的方法是实现在人进入电梯时输出状态
     *输入：人员编号id，电梯当时的楼层f
     *输出：[时间戳]IN-id-楼层
     */
    public static synchronized void printIn(int id, int f, char c) {
        TimableOutput.println(String.format("IN-%d-%d-%c", id, f, c));
    }
    
    /*下面的方法是实现在人走出电梯时输出状态
     *输入：人员编号id，电梯当时的楼层f
     *输出：[时间戳]OUT-id-楼层
     */
    public static synchronized void printOut(int id, int f, char c) {
        TimableOutput.println(String.format("OUT-%d-%d-%c", id, f, c));
    }
}
