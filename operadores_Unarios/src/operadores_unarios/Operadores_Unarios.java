package operadores_unarios;

public class Operadores_Unarios {
    
    public static void main(String[] args) {
        int a = 3;
        var b = -a;//se asigno la variable a en valor negativo
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;//onvertir el valor de true a false solo aplica a tipos booleanos
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        
        // incremento
        //1-Pre incremento (Simbolo antes de la variable)
        var e = 3;//tiene valor de 3 ++ se incrementa y su valor es 4 
        var f = ++e;//primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2-Postincremento (Simbolo despues de la variable)
        var g =5;
        var h = g++;//primero se utiliza el valor y despues se inccrementa
        System.out.println("g = " + g);//incrementa 6
        System.out.println("h = " + h);//regresa al valor de 5 
        
        //decremento
        //1-Predecremento
        var i = 2;
        var j = --i;//aqui se predecrementa y su valor es 1 
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);
        
        //2-Postdecremento
        var k = 4;
        var l =k--;//primero se utiliza el valor de la variable y queda un predecremento pendiente
        System.out.println("k = " + k);//tenia pendiente un decremento
        System.out.println("l = " + l);
        
        
    }
    
}
