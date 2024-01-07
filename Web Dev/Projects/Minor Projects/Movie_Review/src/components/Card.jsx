import '../styles/card.css'

const Card = (props) => {
    return (
        <div className="card-container">
            <img src={props.image} />
            <h2 className="title">{props.title}</h2>
            <h3 className="rating">Rating: {props.rating}</h3>
            <hr />
            <div className="btn-container">
            <button className="imdb"><a href={props.imdb}>IMDB</a></button>
            </div>
        </div>
    )
}

export default Card;