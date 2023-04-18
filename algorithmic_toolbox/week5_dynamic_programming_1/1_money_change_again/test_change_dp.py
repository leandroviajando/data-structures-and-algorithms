import pytest
from change_dp import get_change


@pytest.mark.parametrize(
    ("m", "count"),
    [
        (1, 1),
        (2, 2),
        (3, 1),
        (4, 1),
        (5, 2),
        (6, 2),
        (7, 2),
        (8, 2),
        (9, 3),
        (10, 3),
        (11, 3),
        (12, 3),
        (13, 4),
        (14, 4),
        (15, 4),
        (16, 4),
        (17, 5),
        (18, 5),
        (19, 5),
        (20, 5),
        (21, 6),
        (22, 6),
        (23, 6),
        (24, 6),
        (25, 7),
        (26, 7),
        (27, 7),
        (28, 7),
        (29, 8),
        (30, 8),
        (31, 8),
        (32, 8),
        (33, 9),
        (34, 9),
        (35, 9),
        (36, 9),
        (37, 10),
        (38, 10),
    ],
)
def test_get_change(m: int, count: int) -> None:
    assert get_change(m) == count