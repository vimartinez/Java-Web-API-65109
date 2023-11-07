import React, {useEffect, useState} from "react";
import 'bootstrap/dist/css/bootstrap.css'


const ApiConsumer = () => {

    const [usuarios, setUsuarios] = useState([]);
    useEffect (() => {
        fetch('https://jsonplaceholder.typicode.com/users')
        .then((response) => response.json())
        .then((data) => {
            console.log(data);
            setUsuarios(data);
        })
        .catch((err) => {
            console.log(err.message);
        });
    },[])

    return(
        <div>
            <h5> Listado obtenido de una API</h5>
            <table className="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">UserName</th>
                <th scope="col">Mail</th>
                </tr>
            </thead>
            <tbody>
                {usuarios.map((usuario) => {
                    return(
                        <tr key={usuario.id}>
                            <td>{usuario.id}</td>
                            <td>{usuario.name}</td>
                            <td>{usuario.username}</td>
                            <td>{usuario.email}</td>
                        </tr>
                    )
                })}
                </tbody>
            </table>
            <br /><br />
            <h6>Fuente: https://jsonplaceholder.typicode.com/users</h6>
        </div>
    )
}

export default ApiConsumer;