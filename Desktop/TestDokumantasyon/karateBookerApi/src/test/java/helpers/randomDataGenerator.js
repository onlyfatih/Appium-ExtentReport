function generateRandomName() {
    const names = ["Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Isabella", "James", "Kate", "Liam"]
    const randomIndex = Math.floor(Math.random()* names.length);
return names[randomIndex];
}