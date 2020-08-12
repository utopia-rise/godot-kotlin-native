#!/usr/bin/env sh

if [ -z "$(git status --untracked-files=no --porcelain)" ]; then
  exit 1
fi