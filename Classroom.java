public class Classroom {


    public static void main(String[] args) {

        Wilder ponpon = new Wilder("Ponpon", false);
        Wilder otire = new Wilder("Otire", true);
        Wilder sonia = new Wilder("Sonia", true);
        Wilder xavier = new Wilder("Xavier", true);

        System.out.println(ponpon.whoAmI());
        System.out.println(otire.whoAmI());
        System.out.println(sonia.whoAmI());
        System.out.println(xavier.whoAmI());
    }
}


// Crée une classe Classroom avec une méthode main()

// Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
// Pour chacune des références, affiche le retour de la méthode whoAmI() dans le termina