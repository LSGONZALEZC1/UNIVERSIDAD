#include <iostream>
#include <cstdlib>
#include <ctime>
#include <fstream>
#include <vector>

using namespace std;
 
char getDigit()
{
    return static_cast<char>('0' + rand()%('9'-'0'+1));
}

char getLower()
{
    return static_cast<char>('a' + rand()%('z'-'a'+1));
}

char getUpper()
{
    return static_cast<char>('A' + rand()%('Z'-'A'+1));
}

char getSpecial()
{
    return static_cast<char>('(' + rand()%('/'-'('+1));
}

int main()
{

    ofstream output;
    output.open("pwd.txt");
    srand(time(0));
    // Guardar caracteres generados aleatoriamente
    char ch; 
        // Determinar el tipo de caracteres generados aleatoriamente
         int num;
        // Número de contraseñas de salida
         int contraseñas;
        // Decide si la contraseña contiene caracteres especiales
   char caracteres;
        // Guardar una cadena generada aleatoriamente
         vector <char> str;
        // Determinar si una contraseña contiene caracteres especiales
        
  int count = 0; 
    cout << "Generar contraseña aleatoria con caracter especial" << endl;
    cout << "(S para si y N para No): ";
    cin >> caracteres;
  
   if (caracteres = 'n' && caracteres != 'S' && caracteres !='s'){
      cout <<  "programa cerrado exitosamente!" << endl;
     
     return 0;
     }
  
    cout << "ingrese el numero de contraseñas que deseas: ";
    cin >> contraseñas;
       
       for(int j=0; j<contraseñas; j++) {
      // Generar contraseña de cadena de diez dígitos por defecto
       for (int i= 0 ; i < 10; i ++){
          if(caracteres == 'Y')
                    num = rand()%4;
                  
                else
                    num = rand()%3;
                if(num == 0)
                    ch = getDigit();
                else if(num == 1)
                    ch = getLower();
                else if(num == 2)
                    ch = getUpper();  
                 else
                    {
                        ch = getSpecial();
                        count++;
                    }
                    str.push_back(ch);
        }
    while(caracteres=='Y' && count==0 )
    {
      str.clear();
	  // Genera una contraseña de cadena de diez dígitos por defecto
      for (int i = 0; i <10; i ++) 
            {
                if(caracteres == 'Y')
                    num = rand()%4;
                else
                    num = rand()%2;
                if(num == 0)
                    ch = getDigit();
                else if(num == 1)
                    ch = getLower();
                else if(num == 2)
                    ch = getUpper();
                else
                    {
                        ch = getSpecial()%3;
                        count++;
                    }
    str.push_back(ch);
     }
      
    }
    count = 0;
    vector<char>::iterator p1;
        for(p1=str.begin(); p1!=str.end();p1++)
        {
          output << *p1;
        }
    output << endl;
    str.clear();
    
      }
  
    cout << "Hecho! se creo un archivo con las contraseñas generadas" << endl;
 
    return 0;
}