import java.util.Random;

public class WillyArifA {
  // Metode untuk mengecek apakah suatu angka adalah bilangan prima
  private static boolean isPrime(int n) {
      if (n <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0 ) {
              return false;
          }
      }
      return true;
  }
  public static void main(String[] args) {
      int totalDistance = 25; // Jarak total dalam kilometer
      int checkpointInterval = 2; // Interval setiap checkpoint dalam kilometer

      Random random = new Random();

      System.out.println("Nomor Kupon Undian");

      // Interasi setiap 2 kilometer
      for (int distance = 0; distance <= totalDistance; distance += checkpointInterval) {
          // Generate angka prima secara acak
          int randomPrime = 0;
          do {
              randomPrime = random.nextInt(100); // Angka prima hingga 100 (anda bisa menyesuaikan bats ini)
          } while (!isPrime(randomPrime)); // Ulangi jika angka bukan prima

          // Tampilan nomor checkpoint dan nilai kupon
          System.out.println("Checkpoint " + distance + "km: " + randomPrime);
      }
  }
}
