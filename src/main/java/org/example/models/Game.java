package org.example.models;

public class Game {
    private int appId;
    private String title;
    private String dateRelease;
    private boolean win;
    private boolean mac;
    private boolean linux;
    private String rating;
    private int positiveRatio;
    private int userReviews;
    private double priceFinal;
    private double priceOriginal;
    private double discount;
    private boolean steamDeck;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isMac() {
        return mac;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPositiveRatio() {
        return positiveRatio;
    }

    public void setPositiveRatio(int positiveRatio) {
        this.positiveRatio = positiveRatio;
    }

    public int getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(int userReviews) {
        this.userReviews = userReviews;
    }

    public double getPriceFinal() {
        return priceFinal;
    }

    public void setPriceFinal(double priceFinal) {
        this.priceFinal = priceFinal;
    }

    public double getPriceOriginal() {
        return priceOriginal;
    }

    public void setPriceOriginal(double priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isSteamDeck() {
        return steamDeck;
    }

    public void setSteamDeck(boolean steamDeck) {
        this.steamDeck = steamDeck;
    }

    public Game(int appId, String title, String dateRelease, boolean win, boolean mac, boolean linux, String rating,
                int positiveRatio, int userReviews, double priceFinal, double priceOriginal, double discount, boolean steamDeck) {
        this.appId = appId;
        this.title = title;
        this.dateRelease = dateRelease;
        this.win = win;
        this.mac = mac;
        this.linux = linux;
        this.rating = rating;
        this.positiveRatio = positiveRatio;
        this.userReviews = userReviews;
        this.priceFinal = priceFinal;
        this.priceOriginal = priceOriginal;
        this.discount = discount;
        this.steamDeck = steamDeck;
    }
    // Función para calcular el descuento en porcentaje
    public double calculateDiscountPercentage() {
        if (priceOriginal > 0) {
            return (1 - (priceFinal / priceOriginal)) * 100;
        }
        return 0;
    }

    // Función para determinar si el juego es compatible con todas las plataformas (win, mac, linux)
    public boolean isCompatibleWithAllPlatforms() {
        return win && mac && linux;
    }

    // Función para obtener el precio con descuento aplicado
    public double getDiscountedPrice() {
        return priceOriginal - discount;
    }


    @Override
    public String toString() {
        return "Información del juego:\n" +
                "- ID de la aplicación: " + appId + "\n" +
                "- Título: " + title + "\n" +
                "- Fecha de lanzamiento: " + dateRelease + "\n" +
                "- Disponible en Windows: " + (win ? "Sí" : "No") + "\n" +
                "- Disponible en Mac: " + (mac ? "Sí" : "No") + "\n" +
                "- Disponible en Linux: " + (linux ? "Sí" : "No") + "\n" +
                "- Calificación: " + rating + "\n" +
                "- Proporción de reseñas positivas: " + positiveRatio + "%\n" +
                "- Número de reseñas de usuarios: " + userReviews + "\n" +
                "- Precio final: " + priceFinal + "\n" +
                "- Precio original: " + priceOriginal + "\n" +
                "- Descuento: " + discount + "%\n" +
                "- Compatible con Steam Deck: " + (steamDeck ? "Sí" : "No");
    }
}
