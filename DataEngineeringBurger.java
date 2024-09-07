import java.util.Scanner;

public class DataEngineeringBurger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a category (Learn Programming, Processing, Databases, Message Queue, Cloud Computing, Warehouse, Storage, Data Lake, Orchestration, Resource Manager): ");
            String input = scanner.next();

            switch (input) {
                case "Learn Programming":
                    System.out.println("Learn Programming:");
                    System.out.println("1. SQL");
                    System.out.println("2. Python");
                    System.out.println("3. Java");
                    System.out.println("4. Scala");
                    System.out.println("5. Other");
                    break;
                case "Processing":
                    System.out.println("Processing:");
                    System.out.println("BATCH:");
                    System.out.println("1. Spark");
                    System.out.println("2. Hadoop");
                    System.out.println("3. Flink");
                    System.out.println("4. Other");
                    System.out.println("STREAM:");
                    System.out.println("1. Spark");
                    System.out.println("2. Flink");
                    System.out.println("3. Kafka");
                    System.out.println("4. As");
                    System.out.println("5. Storm");
                    break;
                case "Databases":
                    System.out.println("Databases:");
                    System.out.println("SQL:");
                    System.out.println("1. MYSQL");
                    System.out.println("2. Post Sandstone");
                    System.out.println("3. Oracle");
                    System.out.println("4. Other");
                    System.out.println("NO SQL:");
                    System.out.println("1. Mongo DB");
                    System.out.println("2. Cassandra");
                    System.out.println("3. Hbase");
                    System.out.println("4. Dynamo");
                    System.out.println("5. COSMOS");
                    break;
                case "Message Queue":
                    System.out.println("Message Queue:");
                    System.out.println("1. KAFKA");
                    System.out.println("2. RABBITMQ");
                    System.out.println("3. Other");
                    break;
                case "Cloud Computing":
                    System.out.println("Cloud Computing:");
                    System.out.println("1. AWS");
                    System.out.println("2. AZURE");
                    System.out.println("3. GCP");
                    break;
                case "Warehouse":
                    System.out.println("Warehouse:");
                    System.out.println("1. HIVE");
                    System.out.println("2. SNOWFLAKE");
                    System.out.println("3. REDSHIFT");
                    System.out.println("4. SYNAPSE");
                    System.out.println("5. BIG QUERY");
                    break;
                case "Storage":
                    System.out.println("Storage:");
                    System.out.println("1. HDFS");
                    System.out.println("2. S3");
                    System.out.println("3. ADLS");
                    System.out.println("4. GCS");
                    break;
                case "Data Lake":
                    System.out.println("Data Lake:");
                    System.out.println("1. DATABRICKS");
                    System.out.println("2. SNOWFLAKE");
                    System.out.println("3. DREAM");
                    System.out.println("4. OTHER");
                    break;
                case "Orchestration":
                    System.out.println("Orchestration:");
                    System.out.println("1. Airflow");
                    System.out.println("2. Data factory");
                    System.out.println("3. OTHER");
                    break;
                case "Resource Manager":
                    System.out.println("Resource Manager:");
                    System.out.println("1. YARN");
                    System.out.println("2. MONTHS");
                    break;
                default:
                    System.out.println("Invalid category entered.");
                    break;
            }
        }
    }
}


