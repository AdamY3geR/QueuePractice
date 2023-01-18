public class Main {
    public static void main(String[] args){
        Queue<Double> Que = new Queue<Double>();
        Que.insert(1.0);
        Que.insert(1.0);
        Que.insert(1.0);
        Que.insert(3.0);
        Que.insert(4.0);
        Que.insert(5.0);
        Que.insert(5.0);
        Que.insert(8.0);
        Que.insert(6.0);
        Que.insert(7.0);
        Que.insert(8.0);
        Queue<Double> Que1 = new Queue<Double>();
        Que1.insert(2.0);
        Que1.insert(2.0);
        Que1.insert(2.0);
        Que1.insert(3.0);
        Que1.insert(4.0);
        Que1.insert(5.0);
        Que1.insert(52.0);
        Que1.insert(8.0);
        Que1.insert(3.0);
        Que1.insert(0.1);
        Que1.insert(92.0);
        Queue<Double> Que3 = new Queue<Double>();
        Que3.insert(1.0);
        Que3.insert(1.0);
        Que3.insert(1.0);
        Que3.insert(3.0);
        Que3.insert(4.0);
        Que3.insert(5.0);
        Que3.insert(5.0);
        Que3.insert(8.0);
        Que3.insert(6.0);
        Que3.insert(7.0);
        Que3.insert(8.0);
        int num = 8;
        int count;
        System.out.println(isInQ(Que,num));
        System.out.println(Que.toString());
        System.out.println(outBigNum(Que));
        System.out.println(Que.toString());
        count = howBigisQueue(Que1);
        //Queue<Double> sortedQ = sortQ(Que1,count);
        //System.out.println(sortedQ.toString());
        System.out.println("there are "+sequencesInQ(Que)+" sequences in the Queue");
    }
    public static boolean isInQ(Queue<Double> Que,int num ){
        boolean flag=false;
        Queue<Double> tmpQ = new Queue<Double>();
        while(!Que.isEmpty()){
            if (Que.head()==num) {
                flag = true;
                tmpQ.insert(Que.remove());
            }
            else
                tmpQ.insert(Que.remove());
        }
        while(!tmpQ.isEmpty())
            Que.insert(tmpQ.remove());
        return flag;
        //it's an O(n) program
    }
    public static double outBigNum(Queue<Double> Que){
        Queue<Double> tmpQ1=new Queue<Double>();
        double x = 0;
        while(!Que.isEmpty()){
            if (Que.head()>x){
                x=Que.head();
            }
            else
                tmpQ1.insert(Que.remove());
        }
        while(!tmpQ1.isEmpty()) {
            if (tmpQ1.head()==x)
                tmpQ1.remove();
            else
                Que.insert(tmpQ1.remove());
        }
        return x;
        //it's an O(n) program
    }
    public static int howBigisQueue(Queue<Double> Que1){
        int count=0;
        Queue<Double> tmp = new Queue<Double>();
        while(!Que1.isEmpty()){
            count++;
            tmp.insert(Que1.remove());
        }
        while (!tmp.isEmpty())
            Que1.insert(tmp.remove());
        return count;
    }
    public static Queue<Double> sortQ(Queue<Double> Que1, int count){
        Queue<Double> tmpQ2 = new Queue<Double>();
        Double y = Que1.head();
        Double[] arr = new Double[count];
        int i = 0;
        while(!Que1.isEmpty()){
            if (Que1.head()<y) {
                y = Que1.head();
            }
            else
                tmpQ2.insert(Que1.remove());
        }
        for (int j = 0; j < count; j++) {
            Que1.insert(arr[j]);
        }
        return Que1;
    }
    public static int sequencesInQ(Queue<Double> Que3){
        Queue<Double> tmpQ = new Queue<Double>();
    Double x = ???;
        int count = 0;
        while(!Que3.isEmpty()){
            if (x != Que3.head()) {
                x = Que3.head();
                tmpQ.insert(Que3.remove());
            }
            else if(x = ){
                count++;
                tmpQ.insert(Que3.remove());
            }
        }
        return count;
    }
}