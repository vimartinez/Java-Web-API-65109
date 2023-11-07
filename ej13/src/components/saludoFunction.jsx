import React, { useState } from "react";

const SaludoFunction = (props) => {

    const [age, setAge] = useState(38)
    const incrementAge = () => {
        setAge(age + 1)
    }

    return(
        <div>
            <h3> Componente Function</h3>
            <h4> Hola {props.name}</h4>
            <h4>Tu edad es: {age}</h4>
            <div>
                <button onClick={incrementAge}>Cumplir Años!!</button>
            </div>
        </div>
    )
}



export default SaludoFunction;