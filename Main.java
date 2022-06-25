class Main {
  public static void main(String[] args) {
    int i;    
int tab[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};  
System.out.print("Elementy tablicy przed posortowaniem: \n");  
for(i = 0; i < tab.length; i++)  
System.out.println(tab[i]);                   
sorttab(tab, tab.length);  
System.out.print("Elementy tablicy po posortowaniu: \n");           
for(i = 0; i <tab.length; i++)  
{  
System.out.println(tab[i]);  
}  
}    
private static void sorttab(int tab[], int n)   
{  
for (int i = 1; i < n; i++)  
{  
int j = i;  
int a = tab[i];  
while ((j > 0) && (tab[j-1] > a))   
{  
tab[j] = tab[j-1];  
j--;  
}  
tab[j] = a;  
}  
  }
}