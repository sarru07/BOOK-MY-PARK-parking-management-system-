
package parking.management;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @sarru.07
 */
    
 class priority {
    static String dtm;
     static   Calendar cal=Calendar.getInstance();
   static  int pi= cal.get(Calendar.HOUR_OF_DAY);
  static  int  mi= cal.get(Calendar.MINUTE);
  
     
     String nw,namw,etimw,dtimw;
   static  String []name=new String[100];
   static int []pn=new int[100];
    static String []no=new String[100];
    static String []emailid = new String[100];
   static  String []etime = new String[100];
    static  int []hetime = new int[100];
   static  int []dtime = new int[100];
     static  String []hdtime = new String[100];
     static String []dater = new String[100];

  static   String []payt = new String[100];
  static  int []ammount = new int[100];
    static int front=-1;
	static int rear=-1;
         public static  int isfull()
     {
         if(rear==99)
         {
           JOptionPane.showInputDialog(null,"Warning","full");
           return 1;
         }
         else
         {
             return 0;
         }
     }

    /**
     *
     * @return
     */
    public static int isempty()
         {
             if(front==-1)
             {
               JOptionPane.showInputDialog(null,"Warning","empty");
               return 1;
               
             }
             else
             {
              return 0;   
                 
             }
         }

     public  static void enqueue(String nam,String n,String emaili , 
             String etim,int dtim, String pay, int ammoun,String date,int p)
     {
         System.out.print(dtim);
     int i=0;
     int j=0;
     if(front==-1 && rear==-1){
         front=0;
         rear=0;
          name[rear]=nam;
             no[rear]=n;
             emailid[rear]=emaili;
             etime[rear]=etim;
             dtime[rear]=dtim;
             payt[rear]=pay;
             ammount[rear]=ammoun;
             dater[rear]=date;
             pn[rear]=p;
             rear++;
             return;
     }
     if(isfull()==1)
     {
   return;   
     }
     for(i=front;i<rear;i++)
     {
         
        if(dtime[i]>dtim)
         {
             
             for(j=rear-1;j>=0;j--)
             {
                name[j+1]=name[j];
                no[j+1]=no[j];
                emailid[j+1]=emailid[j];
                etime[j+1]=etime[j];
                dtime[j+1]=dtime[j];
                payt[j+1]=payt[j];
                ammount[j+1]=ammount[j];
                dater[j+1]=dater[j];
                pn[j+1]=pn[j];
                
             }
             name[j+1]=nam;
             no[j+1]=n;
             emailid[j+1]=emaili;
             etime[j+1]=etim;
             dtime[j+1]=dtim;
             payt[j+1]=pay;
             ammount[j+1]=ammoun;
             dater[j+1]=date;
              pn[j+1]=p;
       rear++;
       return;
         }
     } 
       name[rear]=nam;
             no[rear]=n;
             emailid[rear]=emaili;
             etime[rear]=etim;
             dtime[rear]=dtim;
             payt[rear]=pay;
             ammount[rear]=ammoun;
              dater[j+1]=date;
               pn[j+1]=p;

                 rear++;
     }
     
     public static int peekd(){
         
     return  dtime[front];
     
     }

    static String peekc() {
       return name[front];
    }
       static String peeke() {
       return emailid[front];
    }
     
     static void deque(){
         	if(front==-1){
				System.out.println("queue is empty");
                        return ;}
			else{
                    finelink le=new finelink();
   
  le.insert(name[front],no[front], emailid[front], etime[front], dtime[front], payt[front], ammount[front],dater[front],pn[front]);
                            front++;
                            System.out.println("element removed");
                            
			}
			if(front==rear){
                            
				front=-1;
				rear=-1;
			}

                        return ;
	

     
     
     }
   public static void deletespecific(int p)
   {
   int i=front;
   
   while(pn[i]!=p)
   {
   i++;
   
   
   }
   viewlink l=new viewlink();
   dtm=pi+":"+mi;

  viewlink.insert(name[i],no[i], emailid[i], etime[i], dtm, payt[i], ammount[i],dater[i],pn[i]);
  for(int j=i;j<rear-1;j++)
  {
                name[j]=name[j+1];
                no[j]=no[j+1];
                emailid[j]=emailid[j+1];
                etime[j]=etime[j+1];
                dtime[j]=dtime[j+1];
                payt[j]=payt[j+1];
                ammount[j]=ammount[j+1];
                dater[j]=dater[j+1];
                pn[j]=pn[j+1];
 
  
  }
      
   rear--;
   
   
   }
   public  String[] find(int p)
   {
   
   int i=Math.max(front, 0);
   System.out.println(pn.length+"plength"+" i="+i);
    while(pn[i]!=p && i<rear)
   {
   i++;
   
   }
    if(i>rear)
    {
    String []s={"1"};
    
    
    return s;
    }
    if(i==rear&& pn[i]!=p)
    {
      String []s={"1"};
      return s;
    }
    if(pn[i]==p&&i==rear)
    {nw= no[i];
   System.out.print(nw);
     namw=     name[i];
                  etimw=  etime[i];
                 dtimw= dtime[i]/60+ ":"+dtime[i]%60;
   System.out.print(namw);
System.out.print(etimw);
System.out.print(dtimw);
String []s={namw,etimw,dtimw,nw};
return s;
    }
   nw= no[i];
   System.out.print(nw);
     namw=     name[i];
                  etimw=  etime[i];
                 dtimw= dtime[i]/60+ ":"+dtime[i]%60;
   System.out.print(namw);
System.out.print(etimw);
System.out.print(dtimw);
String []s={namw,etimw,dtimw,nw};
    return s;
   
   
   }
   
           
     
     
    }    
        


