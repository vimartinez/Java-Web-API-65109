import React,  { useState } from "react";

const NavBar = (props) => {
    return(
        <div>
            <nav className="navbar navbar-expand-lg bg-body-tertiary">
            <div className="container-fluid">
                <a className="navbar-brand" href="#">{props.name}</a>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNav">
                <div  className="navbar-nav">
                    <a className="nav-link active" aria-current="page" href="/">Home</a>
                    <a className="nav-link "  href="/apiconsumer">Api Consumer</a>
                    <a className="nav-link "  href="/contact">Contact</a>
                    <a className="nav-link "  href="/about">About</a>
                </div>
                </div>
            </div>
            </nav>
        </div>
    )
}

export default NavBar;