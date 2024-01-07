import '../styles/card.css'

const Card = (props) => {
    return (
        <div className="card-container">
            <div className="card">
                <img src={props.img} className="card-img-top" />
                <div className="card-body">
                    <h5 className="card-title">{props.title}</h5>
                    <p className="card-text">{props.year}</p>
                    <p className="card-text">{props.ep}</p>
                    <p className="card-text">{props.tags}</p>
                    {/* <a href="#" className="btn btn-primary"></a> */}
                </div>
            </div>
        </div>
    )
}

export default Card;