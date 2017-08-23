package testjunit;

public class Combination {
public static void main(String[]args){
	for(int i = 0; i<480;i++)
		System.out.println((((i/27)%3)+1)+""+(((i/9)%3)+1)+""+(((i/3)%3)+1)+""+((i%3)+1));
}
}
