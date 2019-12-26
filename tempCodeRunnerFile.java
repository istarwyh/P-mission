import java.util.*;
public class StackJudge{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Integer> list_push= new ArrayList<Integer>();
        System.out.println("请输入压栈序列:");
        int n = in.nextInt();
        while(n!=-1){
            list_push.add(n);
            n  = in.nextInt();
        }
        // for (int i=0;i<list_push.size();i++)
        //     System.out.print(lisoInEyXfht_push.get(i));
        List<Integer> list_pop= new ArrayList<Integer>();
        System.out.println("请输入弹栈序列:");
        n = in.nextInt();
        while(n!=-1){
            list_pop.add(n);
            n  = in.nextInt();
        }
        int[] pushorder = new int[list_push.size()];
        for(int i=0; i<list_push.size();i++){
            pushorder[i] = list_push.get(i);
        }
        int[] poporder = new int[list_pop.size()];
        for(int i=0;i<list_pop.size();i++)
            poporder[i] = list_pop.get(i);
        System.out.println("出栈顺序是正确的吗?:\n"+judgePop(pushorder, poporder));
        in.close();
    }

    public static boolean judgePop(int[] pushorder, int[] poporder){
        if(pushorder == null || poporder == null) return false;
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        for(int i = 0; i < pushorder.length;i++){
            stack.push(pushorder[i]);
            while(stack.empty() ==false || stack.peek() == poporder[temp]){
                stack.pop();
                temp++;
            }
        }
        return stack.empty() == true;
    }
}
