import React from "react";
import { Component } from "react";
import PropTypes from 'prop-types';

class SaludoClass extends Component {

    constructor(props){
        super(props);
        this.state = {
            age : 35
        }
    }

    render(){
        return (
            <div>
                <h3>Componente tipo clase</h3>
                <h4>Hola: {this.props.name}</h4>
                <h4>Tu edad es: {this.state.age}</h4>
                <div>
                    <button onClick={this.incrementarEdad}>Cumplir Años!</button>
                </div>
            </div>
        )
    }

    incrementarEdad = () => (
        this.setState((prevState) => (
            {
                age: prevState.age + 1
            }
        ))
    )
}

SaludoClass.propTypes = {
    name: PropTypes.string
}

export default SaludoClass;