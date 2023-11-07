import React, {useState} from "react";
import 'bootstrap/dist/css/bootstrap.css'

const SaludoBootstrap = (props) =>{
    return (
        <div>
            <div  className="alert alert-success" role="alert"> {props.text}</div>
        </div>
    )
} 

export default SaludoBootstrap;