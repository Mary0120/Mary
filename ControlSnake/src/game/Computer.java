package game;
public class Computer {  String name;  int score;   public int showfist(){   int quan;    quan=(int)(Math.random()*10);   if(quan<=2){    quan=1;   }else if(quan<=5){    quan=2;   }else{     quan=3;    }    switch(quan){    case 1:System.out.println(name+"出拳：剪刀");break;     case 2:System.out.println(name+"出拳：石头");break;     case 3:System.out.println(name+"出拳：布");break;   }    return quan;   }  }