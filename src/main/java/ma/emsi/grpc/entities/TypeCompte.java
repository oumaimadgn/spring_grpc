package ma.emsi.grpc.entities;

public enum TypeCompte {
    COURANT("COURANT"),
    EPARGNE("EPARGNE");

    private final String description;

    // Constructeur privé pour définir la description
    TypeCompte(String description) {
        this.description = description;
    }

    // Getter pour la description
    public String getDescription() {
        return description;
    }

    // Méthode pour créer un TypeCompte (par exemple, pour tests ou autres usages)
    public static TypeCompte build(String type) {
        return switch (type.toUpperCase()) {
            case "COURANT" -> COURANT;
            case "EPARGNE" -> EPARGNE;
            default -> throw new IllegalArgumentException("Type inconnu: " + type);
        };
    }
}
