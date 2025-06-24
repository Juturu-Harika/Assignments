import React from 'react';
import Square from './Square';
import { useSelector, useDispatch } from 'react-redux';
import { makeMove } from '../features/gameSlice';

const Board = () => {
  const board = useSelector((state) => state.game.board);
  const dispatch = useDispatch();

  const renderSquare = (i) => (
    <Square
      key={i}
      value={board[i]}
      onClick={() => dispatch(makeMove(i))}
    />
  );

  return (
    <div
      style={{
        display: 'grid',
        gridTemplateColumns: 'repeat(3, 60px)',
        gap: '5px',
        margin: '20px auto',
        width: 'fit-content'
      }}
    >
      {board.map((_, i) => renderSquare(i))}
    </div>
  );
};

export default Board;
