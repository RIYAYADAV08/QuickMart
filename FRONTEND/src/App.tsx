import { useEffect, useState } from "react";
import "./App.css";

function App() {
  const [users, setUsers] = useState("");
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    async function fetchAllUsers() {
      setIsLoading(true);

      try {
        const response = await fetch(
          "http://localhost:8080/api/v1/users"
        );

        const result = await response.text();

        console.log(result);

        setUsers(result);
      } catch (error) {
        console.log(error);
      } finally {
        setIsLoading(false);
      }
    }

    fetchAllUsers();
  }, []);

  if (isLoading) {
    return <h1>Loading...</h1>;
  }

  return (
    <div>
      <h1>Users</h1>
      <h2>{users}</h2>
    </div>
  );
}

export default App;