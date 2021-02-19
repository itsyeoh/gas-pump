package cs586;
import GasPumps.*;

import java.util.Scanner; 

public class Driver {
	public static void main(String[] args) {
		char ch='1';
		Scanner sc = new Scanner(System.in); 

		while (ch !='q') {
          Driver.displayOperationsMain();
          ch=sc.next().charAt(0); 
          switch (ch) {
			case '1':
			{ //GP1()
				 Driver.GP1Driver();
		         break;
			}
			
			case '2':
			{ //GP2()
				 Driver.GP2Driver();
				 break;
			}
          };
		};

    }
	
	public static void GP1Driver() {
		GP1 gp1 = new GP1();
		
//		Driver.displayOperations();
		
		System.out.print("  Please make a note of these operations");
		System.out.print("\n");
		System.out.print("           GasPump-1 Execution");
		System.out.print("\n");
		char ch='1';
		Scanner sc = new Scanner(System.in); 
      while (ch !='q')
      {
          Driver.displayOperations();
          ch=sc.next().charAt(0); 
          switch (ch)
          {
        case '0':
        { //Activate()
                 System.out.print("  Operation:  Activate(int a)");
                 System.out.print("\n");
                 System.out.print("  Enter value of the parameter a:");
                 System.out.print("\n");
                 int a = sc.nextInt();
                 gp1.Activate(a);
                 break;
             }

        case '1':
        { //Start
                System.out.print("  Operation:  Start()");
                System.out.print("\n");
                gp1.Start();
                break;
            }

        case '2':
        { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                gp1.PayCredit();
                break;
            }

        case '3':
        { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                gp1.Reject();
                break;
            }

        case '4':
        { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                gp1.Cancel();
                break;
            }

        case '5':
        { //Approved
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                gp1.Approved();
                break;
            }

        case '6':
        { //PayCash
                      System.out.print("  Operation:  PayCash(int c)");
                      System.out.print("\n");
                System.out.print("  Enter value of the parameter c:");
                System.out.print("\n");
                int c =  sc.nextInt();
                gp1.PayCash(c);
                break;
               }

        case '7':
        { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                gp1.StartPump();
                break;
            }


        case '8':
        { //PumpLiter
                    System.out.print("  Operation:  PumpLiter()");
                    System.out.print("\n");
                gp1.PumpLiter();
                break;
            }

        case '9':
        { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                gp1.StopPump();
                break;
            }
      }; // endswitch

      }; //endwhile
	}
	
	public static void GP2Driver() {
		GP2 gp2 = new GP2();
		System.out.println("GasPump-2 Execution");
		String ch= "1";
		Scanner sc = new Scanner(System.in); 
		
		while (ch !="q") {
			Driver.displayOperations2();
			ch=sc.next(); 
			
			switch (ch) {
			case "0":
			{ //Activate()
                 System.out.println("  Operation:  Activate(float a, float b, float c)");
                 System.out.println("  Enter value of the parameter a:");
                 float a = (float) sc.nextDouble();
                 System.out.println("  Enter value of the parameter b:");
                 float b = (float) sc.nextDouble();
                 System.out.println("  Enter value of the parameter c:");
                 float c = (float) sc.nextDouble();
                 gp2.Activate(a,b,c);
                 break;
             }

			case "1":
			{ //Start
			    System.out.println("  Operation:  Start()");
		        gp2.Start();
		        break;
		    }
			
			case "2":
			{ //PayCredit
		        System.out.println("  Operation:  PayCredit()");
		        gp2.PayCredit();
		        break;
		    }
		
			case "3":
			{ //Reject
		        System.out.println("  Operation:  Reject()");
		        gp2.Reject();
		        break;
		    }
			
			case "4":
			{ //PayDebii
		        System.out.println("  Operation:  PayDebit(string p)");
		        String p = sc.next();
		        gp2.PayDebit(p);
		        break;
		    }
			
			case "5":
			{ //Pin
		        System.out.println("  Operation:  Pin(string x)");
		        String x = sc.next();
		        gp2.PayDebit(x);
		        break;
		    }
			
			
			case "6":
			{ //Cancel
				System.out.println("  Operation:  Cancel()");
		        gp2.Cancel();
		        break;
		    }
			
			case "7":
			{ //Approved
		        System.out.println("  Operation:  Approved()");
		        gp2.Approved();
		        break;
		    }
			
			case "8":
			{ //Diesel
		        System.out.println("  Operation:  Diesel()");
		        gp2.Diesel();
		        break;
		    }
			
			case "9":
			{ //Regular
		        System.out.println("  Operation:  Regular()");
		        gp2.Regular();
		        break;
		    }
			
			case "10":
			{ //Super
		        System.out.println("  Operation:  Super()");
		        gp2.Super();
		        break;
		    }
			
			case "11":
			{ //StartPump
		        System.out.println("  Operation:  StartPump()");
		        gp2.StartPump();
		        break;
			}
			
			
			case "12":
			{ //PumpGallon
		        System.out.println("  Operation:  PumpGallon()");
		        gp2.PumpGallon();
		        break;
		    }
			
			case "13":
			{ //StopPump
		        System.out.println("  Operation:  StopPump()");
			    gp2.StopPump();
			    break;
			}
			
			case "14":
			{ //FullTank
		        System.out.println("  Operation:  FullTank()");
			    gp2.FullTank();
			    break;
			}
			
			case "q": 
			{
				return;
			}
      }; // endswitch

      }; //endwhile
	}
	

	public static void displayOperations() {
        System.out.println("\n[ GasPump-1 ]");
        System.out.println(" ");
        System.out.println(" MENU of Operations");
        System.out.println("  0. Activate(int)");
        System.out.println("  1. Start()");
        System.out.println("  2. PayCredit()");
        System.out.println("  3. Reject()");
        System.out.println("  4. Cancel()");
        System.out.println("  5. Approved()");
        System.out.println("  6. PayCash(int)");
        System.out.println("  7. StartPump()");
        System.out.println("  8. PumpLiter()");
        System.out.println("  9. StopPump()");
        System.out.println("  q. Go to main menu\n");
        System.out.print("Select operation: ");
	}
	
	public static void displayOperations2() {
        System.out.println("\n[ GasPump-2 ]");
        System.out.println(" ");
        System.out.println(" MENU of Operations");
        System.out.println("  0.  Activate(float, float, float)");
        System.out.println("  1.  Start()");
        System.out.println("  2.  PayCredit()");
        System.out.println("  3.  Reject()");
        System.out.println("  4.  PayDebit(string)");
        System.out.println("  5.  Pin(string)");
        System.out.println("  6.  Cancel()");
        System.out.println("  7.  Approved()");
        System.out.println("  8.  Diesel()");
        System.out.println("  9.  Regular()");
        System.out.println("  10. Super()");
        System.out.println("  11. StartPump()");
        System.out.println("  12. PumpGallon()");
        System.out.println("  13. StopPump()");
        System.out.println("  14. FullTank()");
        System.out.println("  q. Go to main menu\n");
        System.out.print("Select operation: ");
	}
	
	public static void displayOperationsMain() {
        System.out.println("\n[ Main – Jason Yeoh (CS586 Fall 2020) ]");
        System.out.println(" ");
        System.out.println(" MENU of Operations");
        System.out.println("  1. Gas Pump 1");
        System.out.println("  2. Gas Pump 2");
        System.out.println("  q. Quit the program");
        System.out.print("Select operation: ");
	}
}
