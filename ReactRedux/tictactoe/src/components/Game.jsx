import React from 'react';
import Board from './Board';
import { useSelector, useDispatch } from 'react-redux';
import { resetGame } from '../features/gameSlice';

const Game = () => {
  const winner = useSelector((state) => state.game.winner);
  const xIsNext = useSelector((state) => state.game.xIsNext);
  const dispatch = useDispatch();

  const status = winner
    ? `🎉 Winner: ${winner}`
    : `Next Player: ${xIsNext ? 'X' : 'O'}`;

  return (
    <div style={{ textAlign: 'center', fontFamily: 'sans-serif' }}>
      <h1>Tic Tac Toe</h1>
      <h2>{status}</h2>
      <Board />
      <button 
        onClick={() => dispatch(resetGame())}
        style={{
          marginTop: '20px',
          padding: '10px 20px',
          fontSize: '16px',
          cursor: 'pointer'
        }}
      >
        Reset Game
      </button>
    </div>
  );
};

export default Game;
