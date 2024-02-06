package com.fengxiaoshuai.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // JFrame 界面窗体
    // 规定:GameJFrame这个界面就是游戏的主界面
    // 以后跟游戏相关的所有逻辑都写在这个类中
    int[][] arr = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;
    // 定义文件路径
    String path = "image\\sport\\sport1";
    // 定义胜利二维数组
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    // 定义步数
    int step = 0;

    // 创建选项下面的条目对象

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");




    public GameJFrame(){
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据(将图片顺序打乱)
        randomImage();

        // 初始化图片
        initImage();


        // 将图形化界面显示
        this.setVisible(true);
    }

    // 读取类型图片文件夹
    private String readFile(String name,int number){
        Random r = new Random();
        int index = r.nextInt(number) +1 ;
        String path ="image\\" + name + "//" + name+index;
        return path;

    }

    private void randomImage(){
        int[] tempArr = new int[16];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = i;
        }
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(16);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0){
                x = i / 4 ;
                y = i % 4 ;
            }
            arr[i/4][i%4] = tempArr[i];
        }


    }

    private void initImage() {
        // 先加载的图片在上方,后加载的图片塞在下面

        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();
        if(victory()){
            // 显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);


        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);


        // 外循环:添加四行
        for (int i= 0; i < 4; i++) {
            // 内循环:一行添加4张图片
            for (int j = 0; j < 4; j++) {
                // 创建一个图片ImageIcon的对象
                // ImageIcon icon = new ImageIcon("jigsawgame\\image\\girl\\girl1\\1.jpg");
                // 创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(String.format("%s\\%d.jpg",path,arr[i][j])));
                // 指定图片位置
                jLabel.setBounds(j*105 + 83,i*105 + 134,105,105);
                // 给图片添加边框:0表示让图片凸起来,1表示让图片凹下去
                jLabel.setBorder(new BevelBorder(1));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);



            }
        }
        // 添加背景图片
        ImageIcon bg = new ImageIcon(String.format("%s\\background.png",path));
        JLabel background = new JLabel(bg);
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        // 刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上面的两个选项对象(功能与关于我们)
        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        JMenu changeJmenu = new JMenu("更换图片");
        changeJmenu.add(girlItem);
        changeJmenu.add(animalItem);
        changeJmenu.add(sportItem);



        // 将每一个选项下面的条目添加到选项当中
        functionJmenu.add(changeJmenu);


        functionJmenu.add(replayItem);
        functionJmenu.add(reLoginItem);
        functionJmenu.add(closeItem);

        aboutJmenu.add(accountItem);





        // 给条目绑定事件
        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);


        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        // 将菜单的两个选项添加到菜单当中
        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        // 给整个界面菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        // 设置游戏主界面的宽高
        this.setSize(603,680);
        // 设置游戏界面的标题
        this.setTitle("小帅拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置,只有取消了才会安装XY轴的形式添加组件
        this.setLayout(null);
        // 给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            // 把界面中所有的图片删除
            this.getContentPane().removeAll();
            // 加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(String.format("%s\\all.jpg",path)));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            // 加载背景图片
            ImageIcon bg = new ImageIcon(String.format("%s\\background.png",path));
            JLabel background = new JLabel(bg);
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            // 刷新界面
            this.getContentPane().repaint();
        }

    }


    // 松开按键时会调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        // 判断游戏是否胜利,如果胜利,此方法需要直接结束,不能再执行下面的移动代码了
        if(victory()){
            // 利用return直接结束方法
            return;
        }
        // 对左(37)、上(38)、右(39)、下(40)进行判断
        int code = e.getKeyCode();
        if(code == 37){
            System.out.println("向左移动");
            arr[x][y] = arr[x][y+1];
            arr[x][y+1] = 0;
            y++;
            // 每移动一次,计数器就自增一次
            step++;
            initImage();
        }else if(code == 38){
            System.out.println("向上移动");
            // 把空白方块(x和y)的数字(x+1,y)往上移动
            arr[x][y] = arr[x+1][y];
            arr[x+1][y] = 0;
            x++;
            // 每移动一次,计数器就自增一次
            step++;
            // 调用方法按照最新的数字加载图片
            initImage();
        }else if(code == 39){
            System.out.println("向右移动");
            arr[x][y] = arr[x][y-1];
            arr[x][y-1] = 0;
            y--;
            // 每移动一次,计数器就自增一次
            step++;
            initImage();
        }else if(code == 40){
            System.out.println("向下移动");
            // 把空白方块(x和y)的数字(x+1,y)往上移动
            arr[x][y] = arr[x-1][y];
            arr[x-1][y] = 0;
            x--;
            // 每移动一次,计数器就自增一次
            step++;
            initImage();
        }else if(code == 65){
            initImage();
        }else if(code == 87){
            arr = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();

        }

    }

    // 判断arr数组是否拼图成功
    public boolean victory(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(win[i][j] != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的条目对象
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            // 再次打乱二维数组中的数据
            randomImage();
            // 计步器清零
            step = 0;
            // 重新加载图片
            initImage();

        }else if(obj == reLoginItem){
            System.out.println("重新登录");
            //关闭当前游戏界面
            this.setVisible(false);
            // 打开登录界面
            new LoginJFrame();
        }else if(obj == closeItem){
            System.out.println("退出游戏");
            // 直接关闭虚拟机
            System.exit(0);
        }else if(obj == accountItem){
            System.out.println("关注公众号");
            // 创建一个弹框对象
            JDialog jDialog = new JDialog();
            // 创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.jpg"));
            // 设置位置和高
            jLabel.setBounds(0,0,258,258);
            // 把图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            // 给弹框设置大小
            jDialog.setSize(344,344);
            // 让弹框置顶
            jDialog.setAlwaysOnTop(true);
            // 让弹框居中
            jDialog.setLocationRelativeTo(null);
            // 弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            // 让弹框显示出来
            jDialog.setVisible(true);


        }else if(obj == girlItem){
            System.out.println("美女");
            // 重新读取文件
            path = readFile("girl",2);
            // 再次打乱二维数组中的数据
            randomImage();
            // 计步器清零
            step = 0;
            // 重新加载图片
            initImage();
        }else if(obj == animalItem){
            System.out.println("动物");
            path = readFile("animal",8);
            // 再次打乱二维数组中的数据
            randomImage();
            // 计步器清零
            step = 0;
            // 重新加载图片
            initImage();
        }else if(obj == sportItem){
            System.out.println("运动");
            path = readFile("sport",10);
            // 再次打乱二维数组中的数据
            randomImage();
            // 计步器清零
            step = 0;
            // 重新加载图片
            initImage();
        }
    }
}
