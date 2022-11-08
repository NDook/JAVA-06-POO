public class Wilder {

    //attributes
    private String firstname;
    private boolean aware;

    //constructors
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //getter methods
    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    //instances methods
    public String whoAmI() {
        String beAware = this.getAware() ? " et je suis " : " et je ne suis pas ";
        return "Je m'appelle " + this.getFirstname() + beAware + "aware";
    }



}



// Crée une classe Wilder
// Ajoute les attributs String firstname et boolean aware
// Crée un constructeur permettant d'initialiser firstname et aware
// Ajoute des getters et setters pour tous les attributs, en respectant les conventions
// Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware

// Crée une classe Classroom avec une méthode main()

// Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
// Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal
// Compile et teste Classroom : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
// Partage le lien du dépôt GitHub en solution
