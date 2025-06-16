# Use a lightweight OpenJDK image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory
WORKDIR /app

# Copy your Maven project files into the container
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/foodiesapi-0.0.1-SNAPSHOT.jar"]
